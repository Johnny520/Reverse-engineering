package p182j1;

import com.bumptech.glide.AbstractC1924f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: j1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2375d extends AbstractC1924f {

    /* JADX INFO: renamed from: h */
    public final AtomicReferenceFieldUpdater f7708h;

    /* JADX INFO: renamed from: i */
    public final AtomicReferenceFieldUpdater f7709i;

    /* JADX INFO: renamed from: j */
    public final AtomicReferenceFieldUpdater f7710j;

    /* JADX INFO: renamed from: k */
    public final AtomicReferenceFieldUpdater f7711k;

    /* JADX INFO: renamed from: l */
    public final AtomicReferenceFieldUpdater f7712l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2375d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(16);
        this.f7708h = atomicReferenceFieldUpdater;
        this.f7709i = atomicReferenceFieldUpdater2;
        this.f7710j = atomicReferenceFieldUpdater3;
        this.f7711k = atomicReferenceFieldUpdater4;
        this.f7712l = atomicReferenceFieldUpdater5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.AbstractC1924f
    /* JADX INFO: renamed from: e */
    public final boolean mo3513e(AbstractFutureC2378g abstractFutureC2378g, C2374c c2374c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7711k;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2378g, c2374c, C2374c.f7706b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2378g) == c2374c);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.AbstractC1924f
    /* JADX INFO: renamed from: f */
    public final boolean mo3514f(AbstractFutureC2378g abstractFutureC2378g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7712l;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2378g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2378g) == obj);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.AbstractC1924f
    /* JADX INFO: renamed from: g */
    public final boolean mo3515g(AbstractFutureC2378g abstractFutureC2378g, C2377f c2377f, C2377f c2377f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7710j;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2378g, c2377f, c2377f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2378g) == c2377f);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.AbstractC1924f
    /* JADX INFO: renamed from: r */
    public final void mo3516r(C2377f c2377f, C2377f c2377f2) {
        this.f7709i.lazySet(c2377f, c2377f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.AbstractC1924f
    /* JADX INFO: renamed from: s */
    public final void mo3517s(C2377f c2377f, Thread thread) {
        this.f7708h.lazySet(c2377f, thread);
    }
}
