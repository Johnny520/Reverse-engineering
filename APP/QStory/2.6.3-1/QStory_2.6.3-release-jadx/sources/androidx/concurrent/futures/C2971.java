package androidx.concurrent.futures;

import io.ktor.client.plugins.AbstractC4765;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: androidx.concurrent.futures.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2971 extends AbstractC4765 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f6649;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f6650;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f6651;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f6652;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f6653;

    public C2971(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f6653 = atomicReferenceFieldUpdater;
        this.f6652 = atomicReferenceFieldUpdater2;
        this.f6651 = atomicReferenceFieldUpdater3;
        this.f6650 = atomicReferenceFieldUpdater4;
        this.f6649 = atomicReferenceFieldUpdater5;
    }

    @Override // io.ktor.client.plugins.AbstractC4765
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo4428(C2969 c2969, Thread thread) {
        this.f6653.lazySet(c2969, thread);
    }

    @Override // io.ktor.client.plugins.AbstractC4765
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo4429(C2969 c2969, C2969 c29692) {
        this.f6652.lazySet(c2969, c29692);
    }

    @Override // io.ktor.client.plugins.AbstractC4765
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo4430(AbstractFutureC2976 abstractFutureC2976, C2969 c2969, C2969 c29692) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6651;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2976, c2969, c29692)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2976) == c2969);
        return false;
    }

    @Override // io.ktor.client.plugins.AbstractC4765
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo4431(AbstractFutureC2976 abstractFutureC2976, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6649;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2976, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2976) == obj);
        return false;
    }

    @Override // io.ktor.client.plugins.AbstractC4765
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo4432(AbstractFutureC2976 abstractFutureC2976, C2972 c2972) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6650;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2976, c2972, C2972.f6654)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2976) == c2972);
        return false;
    }
}
