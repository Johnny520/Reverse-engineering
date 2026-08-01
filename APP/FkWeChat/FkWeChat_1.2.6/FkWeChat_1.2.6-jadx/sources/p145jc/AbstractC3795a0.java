package p145jc;

import ec.InterfaceC2151k2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: jc.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3795a0 extends AbstractC3796b implements InterfaceC2151k2 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10968d = AtomicIntegerFieldUpdater.newUpdater(AbstractC3795a0.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c */
    public final long f10969c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public AbstractC3795a0(long j10, AbstractC3795a0 abstractC3795a0, int i10) {
        super(abstractC3795a0);
        this.f10969c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // p145jc.AbstractC3796b
    /* JADX INFO: renamed from: k */
    public boolean mo15127k() {
        return f10968d.get(this) == mo9856r() && !m15140l();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m15128p() {
        return f10968d.addAndGet(this, -65536) == mo9856r() && !m15140l();
    }

    /* JADX INFO: renamed from: r */
    public abstract int mo9856r();

    /* JADX INFO: renamed from: s */
    public abstract void mo9857s(int i10, Throwable th, InterfaceC5980j interfaceC5980j);

    /* JADX INFO: renamed from: t */
    public final void m15129t() {
        if (f10968d.incrementAndGet(this) == mo9856r()) {
            m15142n();
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m15130u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10968d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == mo9856r() && !m15140l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
