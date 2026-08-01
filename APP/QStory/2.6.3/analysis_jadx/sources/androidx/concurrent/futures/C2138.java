package androidx.concurrent.futures;

import io.ktor.client.plugins.AbstractC3933;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: androidx.concurrent.futures.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2138 extends AbstractC3933 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f6304;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f6305;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f6306;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f6307;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f6308;

    public C2138(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f6308 = atomicReferenceFieldUpdater;
        this.f6307 = atomicReferenceFieldUpdater2;
        this.f6306 = atomicReferenceFieldUpdater3;
        this.f6305 = atomicReferenceFieldUpdater4;
        this.f6304 = atomicReferenceFieldUpdater5;
    }

    @Override // io.ktor.client.plugins.AbstractC3933
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo3868(C2136 c2136, Thread thread) {
        this.f6308.lazySet(c2136, thread);
    }

    @Override // io.ktor.client.plugins.AbstractC3933
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo3869(C2136 c2136, C2136 c21362) {
        this.f6307.lazySet(c2136, c21362);
    }

    @Override // io.ktor.client.plugins.AbstractC3933
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo3870(AbstractFutureC2143 abstractFutureC2143, C2136 c2136, C2136 c21362) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6306;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2143, c2136, c21362)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2143) == c2136);
        return false;
    }

    @Override // io.ktor.client.plugins.AbstractC3933
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo3871(AbstractFutureC2143 abstractFutureC2143, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6304;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2143, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2143) == obj);
        return false;
    }

    @Override // io.ktor.client.plugins.AbstractC3933
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo3872(AbstractFutureC2143 abstractFutureC2143, C2139 c2139) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6305;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2143, c2139, C2139.f6309)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2143) == c2139);
        return false;
    }
}
