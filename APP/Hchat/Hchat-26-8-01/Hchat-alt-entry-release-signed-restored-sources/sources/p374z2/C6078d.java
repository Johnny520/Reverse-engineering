package p374z2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p259r9.AbstractC3754e0;

/* JADX INFO: renamed from: z2.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6078d extends AbstractC3754e0 {

    /* JADX INFO: renamed from: j */
    public final AtomicReferenceFieldUpdater f24563j;

    /* JADX INFO: renamed from: k */
    public final AtomicReferenceFieldUpdater f24564k;

    /* JADX INFO: renamed from: l */
    public final AtomicReferenceFieldUpdater f24565l;

    /* JADX INFO: renamed from: m */
    public final AtomicReferenceFieldUpdater f24566m;

    /* JADX INFO: renamed from: n */
    public final AtomicReferenceFieldUpdater f24567n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6078d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f24563j = atomicReferenceFieldUpdater;
        this.f24564k = atomicReferenceFieldUpdater2;
        this.f24565l = atomicReferenceFieldUpdater3;
        this.f24566m = atomicReferenceFieldUpdater4;
        this.f24567n = atomicReferenceFieldUpdater5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p259r9.AbstractC3754e0
    /* JADX INFO: renamed from: a0 */
    public final void mo7920a0(C6080f c6080f, C6080f c6080f2) {
        this.f24564k.lazySet(c6080f, c6080f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p259r9.AbstractC3754e0
    /* JADX INFO: renamed from: b0 */
    public final void mo7921b0(C6080f c6080f, Thread thread) {
        this.f24563j.lazySet(c6080f, thread);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p259r9.AbstractC3754e0
    /* JADX INFO: renamed from: k */
    public final boolean mo7922k(AbstractFutureC6081g abstractFutureC6081g, C6077c c6077c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f24566m;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC6081g, c6077c, C6077c.f24561b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC6081g) == c6077c);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p259r9.AbstractC3754e0
    /* JADX INFO: renamed from: l */
    public final boolean mo7923l(AbstractFutureC6081g abstractFutureC6081g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f24567n;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC6081g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC6081g) == obj);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p259r9.AbstractC3754e0
    /* JADX INFO: renamed from: m */
    public final boolean mo7924m(AbstractFutureC6081g abstractFutureC6081g, C6080f c6080f, C6080f c6080f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f24565l;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC6081g, c6080f, c6080f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC6081g) == c6080f);
        return false;
    }
}
