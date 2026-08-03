package Yue;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import net.bytebuddy.asm.Advice;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC4239 implements Executor, Closeable {

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f8599 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f8600 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f8601 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f8602 = 21;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final long f8603 = 2097151;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final long f8604 = 4398044413952L;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f8605 = 42;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final long f8606 = 9223367638808264704L;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f8607 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f8608 = 2097150;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final long f8609 = 2097151;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final long f8610 = -2097152;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final long f8611 = 2097152;

    @InterfaceC6399
    private volatile /* synthetic */ int _isTerminated;

    @InterfaceC6399
    volatile /* synthetic */ long controlState;

    @InterfaceC6399
    private volatile /* synthetic */ long parkedWorkersStack;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC5568
    public final int f8612;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC5568
    public final int f8613;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC5568
    public final long f8614;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final String f8615;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final C5177 f8616;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final C5177 f8617;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final C7119<C4240> f8618;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0366 f8594 = new C0366(null);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C7694 f8598 = new C7694("NOT_IN_STACK");

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f8595 = AtomicLongFieldUpdater.newUpdater(ExecutorC4239.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f8596 = AtomicLongFieldUpdater.newUpdater(ExecutorC4239.class, "controlState");

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8597 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC4239.class, "_isTerminated");

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۧ$ۥ */
    public static final class C0366 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟ۧۧ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0366(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0366() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۧ$ۥ۟ */
    public /* synthetic */ class C0367 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f751;

        static {
            int[] iArr = new int[EnumC4241.values().length];
            iArr[EnumC4241.PARKING.ordinal()] = 1;
            iArr[EnumC4241.BLOCKING.ordinal()] = 2;
            iArr[EnumC4241.CPU_ACQUIRED.ordinal()] = 3;
            iArr[EnumC4241.DORMANT.ordinal()] = 4;
            iArr[EnumC4241.TERMINATED.ordinal()] = 5;
            f751 = iArr;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۧ$ۥ۟۟۟, reason: contains not printable characters */
    public enum EnumC4241 {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExecutorC4239(int i, int i2, long j, @InterfaceC6399 String str) {
        this.f8612 = i;
        this.f8613 = i2;
        this.f8614 = j;
        this.f8615 = str;
        if (i < 1) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f8616 = new C5177();
        this.f8617 = new C5177();
        this.parkedWorkersStack = 0L;
        this.f8618 = new C7119<>(i + 1);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m12189(ExecutorC4239 executorC4239, Runnable runnable, InterfaceC7726 interfaceC7726, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC7726 = C7737.f23279;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        executorC4239.m12199(runnable, interfaceC7726, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static /* synthetic */ boolean m12190(ExecutorC4239 executorC4239, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = executorC4239.controlState;
        }
        return executorC4239.m12215(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        m12210(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@InterfaceC6399 Runnable runnable) {
        m12189(this, runnable, null, false, 6, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r10v1, (wrap:char:SGET) */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r10v1, 98 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r10v1, 99 */
    @InterfaceC6399
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iM3406 = this.f8618.m3406();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM3406; i6++) {
            C4240 c4240M3407 = this.f8618.m3407(i6);
            if (c4240M3407 != null) {
                int iM28395 = c4240M3407.f8620.m28395();
                int i7 = C0367.f751[c4240M3407.f8621.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM28395);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM28395);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iM28395 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM28395);
                        sb3.append(Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL);
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return this.f8615 + '@' + C4325.m1289(this) + "[Pool Size {core = " + this.f8612 + ", max = " + this.f8613 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f8616.m18128() + ", global blocking queue size = " + this.f8617.m18128() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((f8604 & j) >> 21)) + ", CPUs acquired = " + (this.f8612 - ((int) ((f8606 & j) >> 42))) + "}]";
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m1202(AbstractRunnableC7725 abstractRunnableC7725) {
        return abstractRunnableC7725.f23251.mo17604() == 1 ? this.f8617.m2521(abstractRunnableC7725) : this.f8616.m2521(abstractRunnableC7725);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m12191(long j) {
        return (int) ((j & f8606) >> 42);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m12192(long j) {
        return (int) ((j & f8604) >> 21);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m12193() {
        synchronized (this.f8618) {
            if (isTerminated()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int iM21661 = C7007.m21661(i - ((int) ((j & f8604) >> 21)), 0);
            if (iM21661 >= this.f8612) {
                return 0;
            }
            if (i >= this.f8613) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 <= 0 || this.f8618.m3407(i2) != null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            C4240 c4240 = new C4240(this, i2);
            this.f8618.m22229(i2, c4240);
            if (i2 != ((int) (2097151 & f8596.incrementAndGet(this)))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c4240.start();
            return iM21661 + 1;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final AbstractRunnableC7725 m12194(@InterfaceC6399 Runnable runnable, @InterfaceC6399 InterfaceC7726 interfaceC7726) {
        long jMo2813 = C7737.f23276.mo2813();
        if (!(runnable instanceof AbstractRunnableC7725)) {
            return new C7729(runnable, jMo2813, interfaceC7726);
        }
        AbstractRunnableC7725 abstractRunnableC7725 = (AbstractRunnableC7725) runnable;
        abstractRunnableC7725.f23250 = jMo2813;
        abstractRunnableC7725.f23251 = interfaceC7726;
        return abstractRunnableC7725;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final int m12195(long j) {
        return (int) (j & 2097151);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final C4240 m12196() {
        Thread threadCurrentThread = Thread.currentThread();
        C4240 c4240 = threadCurrentThread instanceof C4240 ? (C4240) threadCurrentThread : null;
        if (c4240 == null || !C5499.m17094(ExecutorC4239.this, this)) {
            return null;
        }
        return c4240;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m12197() {
        f8596.addAndGet(this, f8610);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int m12198() {
        return (int) (f8596.getAndDecrement(this) & 2097151);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m12199(@InterfaceC6399 Runnable runnable, @InterfaceC6399 InterfaceC7726 interfaceC7726, boolean z) {
        AbstractC3018 abstractC3018M84 = C3019.m84();
        if (abstractC3018M84 != null) {
            abstractC3018M84.m5894();
        }
        AbstractRunnableC7725 abstractRunnableC7725M12194 = m12194(runnable, interfaceC7726);
        C4240 c4240M12196 = m12196();
        AbstractRunnableC7725 abstractRunnableC7725M12213 = m12213(c4240M12196, abstractRunnableC7725M12194, z);
        if (abstractRunnableC7725M12213 != null && !m1202(abstractRunnableC7725M12213)) {
            throw new RejectedExecutionException(this.f8615 + " was terminated");
        }
        boolean z2 = z && c4240M12196 != null;
        if (abstractRunnableC7725M12194.f23251.mo17604() != 0) {
            m12211(z2);
        } else {
            if (z2) {
                return;
            }
            m12212();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final int m12200() {
        return (int) ((this.controlState & f8606) >> 42);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final int m12201() {
        return (int) (this.controlState & 2097151);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final long m12202() {
        return f8596.addAndGet(this, f8611);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final int m12203() {
        return (int) (f8596.incrementAndGet(this) & 2097151);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final int m12204(C4240 c4240) {
        Object objM12222 = c4240.m12222();
        while (objM12222 != f8598) {
            if (objM12222 == null) {
                return 0;
            }
            C4240 c42402 = (C4240) objM12222;
            int iM12221 = c42402.m12221();
            if (iM12221 != 0) {
                return iM12221;
            }
            objM12222 = c42402.m12222();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final C4240 m12205() {
        while (true) {
            long j = this.parkedWorkersStack;
            C4240 c4240M3407 = this.f8618.m3407((int) (2097151 & j));
            if (c4240M3407 == null) {
                return null;
            }
            long j2 = (f8611 + j) & f8610;
            int iM12204 = m12204(c4240M3407);
            if (iM12204 >= 0 && f8595.compareAndSet(this, j, ((long) iM12204) | j2)) {
                c4240M3407.m12231(f8598);
                return c4240M3407;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final boolean m12206(@InterfaceC6399 C4240 c4240) {
        long j;
        long j2;
        int iM12221;
        if (c4240.m12222() != f8598) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            j2 = (f8611 + j) & f8610;
            iM12221 = c4240.m12221();
            c4240.m12231(this.f8618.m3407((int) (2097151 & j)));
        } while (!f8595.compareAndSet(this, j, j2 | ((long) iM12221)));
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final void m12207(@InterfaceC6399 C4240 c4240, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int iM12204 = (int) (2097151 & j);
            long j2 = (f8611 + j) & f8610;
            if (iM12204 == i) {
                iM12204 = i2 == 0 ? m12204(c4240) : i2;
            }
            if (iM12204 >= 0 && f8595.compareAndSet(this, j, j2 | ((long) iM12204))) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final long m12208() {
        return f8596.addAndGet(this, 4398046511104L);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE]}, finally: {[INVOKE, INVOKE, IF] complete} */
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m12209(@InterfaceC6399 AbstractRunnableC7725 abstractRunnableC7725) {
        try {
            abstractRunnableC7725.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                AbstractC3018 abstractC3018M84 = C3019.m84();
                if (abstractC3018M84 == null) {
                }
            } finally {
                AbstractC3018 abstractC3018M842 = C3019.m84();
                if (abstractC3018M842 != null) {
                    abstractC3018M842.m5895();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12210(long j) throws InterruptedException {
        int i;
        AbstractRunnableC7725 abstractRunnableC7725M18132;
        if (f8597.compareAndSet(this, 0, 1)) {
            C4240 c4240M12196 = m12196();
            synchronized (this.f8618) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C4240 c4240M3407 = this.f8618.m3407(i2);
                    C5499.m17100(c4240M3407);
                    C4240 c4240 = c4240M3407;
                    if (c4240 != c4240M12196) {
                        while (c4240.isAlive()) {
                            LockSupport.unpark(c4240);
                            c4240.join(j);
                        }
                        c4240.f8620.m28396(this.f8617);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f8617.m2522();
            this.f8616.m2522();
            while (true) {
                if (c4240M12196 == null) {
                    abstractRunnableC7725M18132 = this.f8616.m18132();
                    if (abstractRunnableC7725M18132 == null && (abstractRunnableC7725M18132 = this.f8617.m18132()) == null) {
                        break;
                    }
                } else {
                    abstractRunnableC7725M18132 = c4240M12196.m12220(true);
                    if (abstractRunnableC7725M18132 != null) {
                        continue;
                    }
                }
                m12209(abstractRunnableC7725M18132);
            }
            if (c4240M12196 != null) {
                c4240M12196.m12234(EnumC4241.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public final void m12211(boolean z) {
        long jAddAndGet = f8596.addAndGet(this, f8611);
        if (z || m12216() || m12215(jAddAndGet)) {
            return;
        }
        m12216();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final void m12212() {
        if (m12216() || m12190(this, 0L, 1, null)) {
            return;
        }
        m12216();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final AbstractRunnableC7725 m12213(C4240 c4240, AbstractRunnableC7725 abstractRunnableC7725, boolean z) {
        if (c4240 == null || c4240.f8621 == EnumC4241.TERMINATED) {
            return abstractRunnableC7725;
        }
        if (abstractRunnableC7725.f23251.mo17604() == 0 && c4240.f8621 == EnumC4241.BLOCKING) {
            return abstractRunnableC7725;
        }
        c4240.f8625 = true;
        return c4240.f8620.m4520(abstractRunnableC7725, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public final boolean m12214() {
        long j;
        do {
            j = this.controlState;
            if (((int) ((f8606 & j) >> 42)) == 0) {
                return false;
            }
        } while (!f8596.compareAndSet(this, j, j - 4398046511104L));
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final boolean m12215(long j) {
        if (C7007.m21661(((int) (2097151 & j)) - ((int) ((j & f8604) >> 21)), 0) < this.f8612) {
            int iM12193 = m12193();
            if (iM12193 == 1 && this.f8612 > 1) {
                m12193();
            }
            if (iM12193 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public final boolean m12216() {
        C4240 c4240M12205;
        do {
            c4240M12205 = m12205();
            if (c4240M12205 == null) {
                return false;
            }
        } while (!C4240.f8619.compareAndSet(c4240M12205, -1, 0));
        LockSupport.unpark(c4240M12205);
        return true;
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۧ$ۥ۟۟, reason: contains not printable characters */
    public final class C4240 extends Thread {

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f8619 = AtomicIntegerFieldUpdater.newUpdater(C4240.class, "workerCtl");
        private volatile int indexInArray;

        @InterfaceC6489
        private volatile Object nextParkedWorker;

        @InterfaceC6399
        volatile /* synthetic */ int workerCtl;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public final C8530 f8620;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6399
        @InterfaceC5568
        public EnumC4241 f8621;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public long f8622;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public long f8623;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f8624;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        @InterfaceC5568
        public boolean f8625;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C4240() {
            setDaemon(true);
            this.f8620 = new C8530();
            this.f8621 = EnumC4241.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = ExecutorC4239.f8598;
            this.f8624 = AbstractC7000.f21141.mo5816();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m12229();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m1204(int i) {
            if (i == 0) {
                return;
            }
            ExecutorC4239.f8596.addAndGet(ExecutorC4239.this, ExecutorC4239.f8610);
            if (this.f8621 != EnumC4241.TERMINATED) {
                this.f8621 = EnumC4241.DORMANT;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m12217(int i) {
            if (i != 0 && m12234(EnumC4241.BLOCKING)) {
                ExecutorC4239.this.m12212();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m12218(AbstractRunnableC7725 abstractRunnableC7725) {
            int iMo17604 = abstractRunnableC7725.f23251.mo17604();
            m12224(iMo17604);
            m12217(iMo17604);
            ExecutorC4239.this.m12209(abstractRunnableC7725);
            m1204(iMo17604);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final AbstractRunnableC7725 m12219(boolean z) {
            AbstractRunnableC7725 abstractRunnableC7725M12228;
            AbstractRunnableC7725 abstractRunnableC7725M122282;
            if (z) {
                boolean z2 = m12226(ExecutorC4239.this.f8612 * 2) == 0;
                if (z2 && (abstractRunnableC7725M122282 = m12228()) != null) {
                    return abstractRunnableC7725M122282;
                }
                AbstractRunnableC7725 abstractRunnableC7725M28397 = this.f8620.m28397();
                if (abstractRunnableC7725M28397 != null) {
                    return abstractRunnableC7725M28397;
                }
                if (!z2 && (abstractRunnableC7725M12228 = m12228()) != null) {
                    return abstractRunnableC7725M12228;
                }
            } else {
                AbstractRunnableC7725 abstractRunnableC7725M122283 = m12228();
                if (abstractRunnableC7725M122283 != null) {
                    return abstractRunnableC7725M122283;
                }
            }
            return m12235(false);
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final AbstractRunnableC7725 m12220(boolean z) {
            AbstractRunnableC7725 abstractRunnableC7725M18132;
            if (m12232()) {
                return m12219(z);
            }
            if (!z || (abstractRunnableC7725M18132 = this.f8620.m28397()) == null) {
                abstractRunnableC7725M18132 = ExecutorC4239.this.f8617.m18132();
            }
            return abstractRunnableC7725M18132 == null ? m12235(true) : abstractRunnableC7725M18132;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final int m12221() {
            return this.indexInArray;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final Object m12222() {
            return this.nextParkedWorker;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final ExecutorC4239 m12223() {
            return ExecutorC4239.this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m12224(int i) {
            this.f8622 = 0L;
            if (this.f8621 == EnumC4241.PARKING) {
                this.f8621 = EnumC4241.BLOCKING;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final boolean m12225() {
            return this.nextParkedWorker != ExecutorC4239.f8598;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final int m12226(int i) {
            int i2 = this.f8624;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f8624 = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final void m12227() {
            if (this.f8622 == 0) {
                this.f8622 = System.nanoTime() + ExecutorC4239.this.f8614;
            }
            LockSupport.parkNanos(ExecutorC4239.this.f8614);
            if (System.nanoTime() - this.f8622 >= 0) {
                this.f8622 = 0L;
                m12236();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final AbstractRunnableC7725 m12228() {
            if (m12226(2) == 0) {
                AbstractRunnableC7725 abstractRunnableC7725M18132 = ExecutorC4239.this.f8616.m18132();
                return abstractRunnableC7725M18132 != null ? abstractRunnableC7725M18132 : ExecutorC4239.this.f8617.m18132();
            }
            AbstractRunnableC7725 abstractRunnableC7725M181322 = ExecutorC4239.this.f8617.m18132();
            return abstractRunnableC7725M181322 != null ? abstractRunnableC7725M181322 : ExecutorC4239.this.f8616.m18132();
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m12229() {
            loop0: while (true) {
                boolean z = false;
                while (!ExecutorC4239.this.isTerminated() && this.f8621 != EnumC4241.TERMINATED) {
                    AbstractRunnableC7725 abstractRunnableC7725M12220 = m12220(this.f8625);
                    if (abstractRunnableC7725M12220 != null) {
                        this.f8623 = 0L;
                        m12218(abstractRunnableC7725M12220);
                    } else {
                        this.f8625 = false;
                        if (this.f8623 == 0) {
                            m12233();
                        } else if (z) {
                            m12234(EnumC4241.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f8623);
                            this.f8623 = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
                break loop0;
            }
            m12234(EnumC4241.TERMINATED);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final void m12230(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC4239.this.f8615);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final void m12231(@InterfaceC6489 Object obj) {
            this.nextParkedWorker = obj;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final boolean m12232() {
            long j;
            if (this.f8621 == EnumC4241.CPU_ACQUIRED) {
                return true;
            }
            ExecutorC4239 executorC4239 = ExecutorC4239.this;
            do {
                j = executorC4239.controlState;
                if (((int) ((ExecutorC4239.f8606 & j) >> 42)) == 0) {
                    return false;
                }
            } while (!ExecutorC4239.f8596.compareAndSet(executorC4239, j, j - 4398046511104L));
            this.f8621 = EnumC4241.CPU_ACQUIRED;
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public final void m12233() {
            if (!m12225()) {
                ExecutorC4239.this.m12206(this);
                return;
            }
            this.workerCtl = -1;
            while (m12225() && this.workerCtl == -1 && !ExecutorC4239.this.isTerminated() && this.f8621 != EnumC4241.TERMINATED) {
                m12234(EnumC4241.PARKING);
                Thread.interrupted();
                m12227();
            }
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final boolean m12234(@InterfaceC6399 EnumC4241 enumC4241) {
            EnumC4241 enumC42412 = this.f8621;
            boolean z = enumC42412 == EnumC4241.CPU_ACQUIRED;
            if (z) {
                ExecutorC4239.f8596.addAndGet(ExecutorC4239.this, 4398046511104L);
            }
            if (enumC42412 != enumC4241) {
                this.f8621 = enumC4241;
            }
            return z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final AbstractRunnableC7725 m12235(boolean z) {
            int i = (int) (ExecutorC4239.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int iM12226 = m12226(i);
            ExecutorC4239 executorC4239 = ExecutorC4239.this;
            long jMin = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                iM12226++;
                if (iM12226 > i) {
                    iM12226 = 1;
                }
                C4240 c4240M3407 = executorC4239.f8618.m3407(iM12226);
                if (c4240M3407 != null && c4240M3407 != this) {
                    long jM28400 = z ? this.f8620.m28400(c4240M3407.f8620) : this.f8620.m28401(c4240M3407.f8620);
                    if (jM28400 == -1) {
                        return this.f8620.m28397();
                    }
                    if (jM28400 > 0) {
                        jMin = Math.min(jMin, jM28400);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f8623 = jMin;
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final void m12236() {
            ExecutorC4239 executorC4239 = ExecutorC4239.this;
            synchronized (executorC4239.f8618) {
                try {
                    if (executorC4239.isTerminated()) {
                        return;
                    }
                    if (((int) (executorC4239.controlState & 2097151)) <= executorC4239.f8612) {
                        return;
                    }
                    if (f8619.compareAndSet(this, -1, 1)) {
                        int i = this.indexInArray;
                        m12230(0);
                        executorC4239.m12207(this, i, 0);
                        int andDecrement = (int) (ExecutorC4239.f8596.getAndDecrement(executorC4239) & 2097151);
                        if (andDecrement != i) {
                            C4240 c4240M3407 = executorC4239.f8618.m3407(andDecrement);
                            C5499.m17100(c4240M3407);
                            C4240 c4240 = c4240M3407;
                            executorC4239.f8618.m22229(i, c4240);
                            c4240.m12230(i);
                            executorC4239.m12207(c4240, andDecrement, i);
                        }
                        executorC4239.f8618.m22229(andDecrement, null);
                        C8107 c8107 = C8107.f3222;
                        this.f8621 = EnumC4241.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public C4240(ExecutorC4239 executorC4239, int i) {
            this();
            m12230(i);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r7v0 int)
  (r8v0 int)
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: SGET  A[WRAPPED] (LINE:21) Yue.ۥۢۡ۟ۤ.ۥ۟۟۟۟ long) : (r9v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000b: SGET  A[WRAPPED] (LINE:22) Yue.ۥۢۡ۟ۤ.ۥ java.lang.String) : (r11v0 java.lang.String))
 A[MD:(int, int, long, java.lang.String):void (m)] (LINE:23) call: Yue.ۥۣ۟ۧۧ.<init>(int, int, long, java.lang.String):void type: THIS */
    public /* synthetic */ ExecutorC4239(int i, int i2, long j, String str, int i3, C4335 c4335) {
        this(i, i2, (i3 & 4) != 0 ? C7737.f23275 : j, (i3 & 8) != 0 ? C7737.f3052 : str);
    }
}
