package Yue;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥۢۦ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8530 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3540 = AtomicReferenceFieldUpdater.newUpdater(C8530.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25350 = AtomicIntegerFieldUpdater.newUpdater(C8530.class, "producerIndex");

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25351 = AtomicIntegerFieldUpdater.newUpdater(C8530.class, "consumerIndex");

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25352 = AtomicIntegerFieldUpdater.newUpdater(C8530.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final AtomicReferenceArray<AbstractRunnableC7725> f3541 = new AtomicReferenceArray<>(128);

    @InterfaceC6399
    private volatile /* synthetic */ Object lastScheduledTask = null;

    @InterfaceC6399
    private volatile /* synthetic */ int producerIndex = 0;

    @InterfaceC6399
    private volatile /* synthetic */ int consumerIndex = 0;

    @InterfaceC6399
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ AbstractRunnableC7725 m4519(C8530 c8530, AbstractRunnableC7725 abstractRunnableC7725, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c8530.m4520(abstractRunnableC7725, z);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final AbstractRunnableC7725 m4520(@InterfaceC6399 AbstractRunnableC7725 abstractRunnableC7725, boolean z) {
        if (z) {
            return m28392(abstractRunnableC7725);
        }
        AbstractRunnableC7725 abstractRunnableC77252 = (AbstractRunnableC7725) f3540.getAndSet(this, abstractRunnableC7725);
        if (abstractRunnableC77252 == null) {
            return null;
        }
        return m28392(abstractRunnableC77252);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final AbstractRunnableC7725 m28392(AbstractRunnableC7725 abstractRunnableC7725) {
        if (abstractRunnableC7725.f23251.mo17604() == 1) {
            f25352.incrementAndGet(this);
        }
        if (m28394() == 127) {
            return abstractRunnableC7725;
        }
        int i = this.producerIndex & 127;
        while (this.f3541.get(i) != null) {
            Thread.yield();
        }
        this.f3541.lazySet(i, abstractRunnableC7725);
        f25350.incrementAndGet(this);
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m28393(AbstractRunnableC7725 abstractRunnableC7725) {
        if (abstractRunnableC7725 == null || abstractRunnableC7725.f23251.mo17604() != 1) {
            return;
        }
        f25352.decrementAndGet(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m28394() {
        return this.producerIndex - this.consumerIndex;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m28395() {
        return this.lastScheduledTask != null ? m28394() + 1 : m28394();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m28396(@InterfaceC6399 C5177 c5177) {
        AbstractRunnableC7725 abstractRunnableC7725 = (AbstractRunnableC7725) f3540.getAndSet(this, null);
        if (abstractRunnableC7725 != null) {
            c5177.m2521(abstractRunnableC7725);
        }
        while (m28399(c5177)) {
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final AbstractRunnableC7725 m28397() {
        AbstractRunnableC7725 abstractRunnableC7725 = (AbstractRunnableC7725) f3540.getAndSet(this, null);
        return abstractRunnableC7725 == null ? m28398() : abstractRunnableC7725;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final AbstractRunnableC7725 m28398() {
        AbstractRunnableC7725 andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f25351.compareAndSet(this, i, i + 1) && (andSet = this.f3541.getAndSet(i2, null)) != null) {
                m28393(andSet);
                return andSet;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m28399(C5177 c5177) {
        AbstractRunnableC7725 abstractRunnableC7725M28398 = m28398();
        if (abstractRunnableC7725M28398 == null) {
            return false;
        }
        c5177.m2521(abstractRunnableC7725M28398);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final long m28400(@InterfaceC6399 C8530 c8530) {
        int i = c8530.producerIndex;
        AtomicReferenceArray<AbstractRunnableC7725> atomicReferenceArray = c8530.f3541;
        for (int i2 = c8530.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (c8530.blockingTasksInBuffer == 0) {
                break;
            }
            AbstractRunnableC7725 abstractRunnableC7725 = atomicReferenceArray.get(i3);
            if (abstractRunnableC7725 != null && abstractRunnableC7725.f23251.mo17604() == 1 && C4079.m1036(atomicReferenceArray, i3, abstractRunnableC7725, null)) {
                f25352.decrementAndGet(c8530);
                m4519(this, abstractRunnableC7725, false, 2, null);
                return -1L;
            }
        }
        return m28402(c8530, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final long m28401(@InterfaceC6399 C8530 c8530) {
        AbstractRunnableC7725 abstractRunnableC7725M28398 = c8530.m28398();
        if (abstractRunnableC7725M28398 == null) {
            return m28402(c8530, false);
        }
        m4519(this, abstractRunnableC7725M28398, false, 2, null);
        return -1L;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final long m28402(C8530 c8530, boolean z) {
        AbstractRunnableC7725 abstractRunnableC7725;
        do {
            abstractRunnableC7725 = (AbstractRunnableC7725) c8530.lastScheduledTask;
            if (abstractRunnableC7725 == null) {
                return -2L;
            }
            if (z && abstractRunnableC7725.f23251.mo17604() != 1) {
                return -2L;
            }
            long jMo2813 = C7737.f23276.mo2813() - abstractRunnableC7725.f23250;
            long j = C7737.f3053;
            if (jMo2813 < j) {
                return j - jMo2813;
            }
        } while (!C3008.m74(f3540, c8530, abstractRunnableC7725, null));
        m4519(this, abstractRunnableC7725, false, 2, null);
        return -1L;
    }
}
