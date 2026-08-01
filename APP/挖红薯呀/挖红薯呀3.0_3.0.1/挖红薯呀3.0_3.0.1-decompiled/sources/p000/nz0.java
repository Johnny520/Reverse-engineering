package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nz0 extends AbstractC0321ij implements zj0 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4373f = AtomicIntegerFieldUpdater.newUpdater(nz0.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: e */
    public final long f4374e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nz0(long j, nz0 nz0Var, int i) {
        super(nz0Var);
        this.f4374e = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0321ij
    /* JADX INFO: renamed from: f */
    public final boolean mo1587f() {
        return f4373f.get(this) == mo2402k() && m1584c() != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m2745j() {
        return f4373f.addAndGet(this, -65536) == mo2402k() && m1584c() != null;
    }

    /* JADX INFO: renamed from: k */
    public abstract int mo2402k();

    /* JADX INFO: renamed from: l */
    public abstract void mo2403l(int i, InterfaceC0618pk interfaceC0618pk);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m2746m() {
        if (f4373f.incrementAndGet(this) == mo2402k()) {
            m1589h();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final boolean m2747n() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f4373f;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo2402k() && m1584c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
