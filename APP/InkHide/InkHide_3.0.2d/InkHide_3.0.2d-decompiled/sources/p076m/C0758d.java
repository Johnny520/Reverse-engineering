package p076m;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p052b1.AbstractC0503h;

/* JADX INFO: renamed from: m.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0758d extends AbstractC0503h {

    /* JADX INFO: renamed from: p */
    public final AtomicReferenceFieldUpdater f2566p;

    /* JADX INFO: renamed from: q */
    public final AtomicReferenceFieldUpdater f2567q;

    /* JADX INFO: renamed from: r */
    public final AtomicReferenceFieldUpdater f2568r;

    /* JADX INFO: renamed from: s */
    public final AtomicReferenceFieldUpdater f2569s;

    /* JADX INFO: renamed from: t */
    public final AtomicReferenceFieldUpdater f2570t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0758d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f2566p = atomicReferenceFieldUpdater;
        this.f2567q = atomicReferenceFieldUpdater2;
        this.f2568r = atomicReferenceFieldUpdater3;
        this.f2569s = atomicReferenceFieldUpdater4;
        this.f2570t = atomicReferenceFieldUpdater5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: K */
    public final void mo994K(C0760f c0760f, C0760f c0760f2) {
        this.f2567q.lazySet(c0760f, c0760f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: L */
    public final void mo995L(C0760f c0760f, Thread thread) {
        this.f2566p.lazySet(c0760f, thread);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: d */
    public final boolean mo998d(AbstractFutureC0761g abstractFutureC0761g, C0757c c0757c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0757c c0757c2 = C0757c.f2564b;
        do {
            atomicReferenceFieldUpdater = this.f2569s;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0761g, c0757c, c0757c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0761g) == c0757c);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: e */
    public final boolean mo999e(AbstractFutureC0761g abstractFutureC0761g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2570t;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0761g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0761g) == obj);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: f */
    public final boolean mo1000f(AbstractFutureC0761g abstractFutureC0761g, C0760f c0760f, C0760f c0760f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2568r;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0761g, c0760f, c0760f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0761g) == c0760f);
        return false;
    }
}
