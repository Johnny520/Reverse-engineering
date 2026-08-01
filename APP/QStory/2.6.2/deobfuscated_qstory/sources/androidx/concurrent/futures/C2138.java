package androidx.concurrent.futures;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.reflect.jvm.internal.AbstractC5061;

/* JADX INFO: renamed from: androidx.concurrent.futures.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2138 extends AbstractC5061 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f6303;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f6304;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f6305;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f6306;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f6307;

    public C2138(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f6306 = atomicReferenceFieldUpdater;
        this.f6305 = atomicReferenceFieldUpdater2;
        this.f6304 = atomicReferenceFieldUpdater3;
        this.f6303 = atomicReferenceFieldUpdater4;
        this.f6307 = atomicReferenceFieldUpdater5;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5061
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo3858(C2136 c2136, Thread thread) {
        this.f6306.lazySet(c2136, thread);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5061
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final void mo3859(C2136 c2136, C2136 c21362) {
        this.f6305.lazySet(c2136, c21362);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5061
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo3860(AbstractFutureC2143 abstractFutureC2143, C2139 c2139) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6303;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2143, c2139, C2139.f6308)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2143) == c2139);
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5061
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo3861(AbstractFutureC2143 abstractFutureC2143, C2136 c2136, C2136 c21362) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6304;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2143, c2136, c21362)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2143) == c2136);
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5061
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo3862(AbstractFutureC2143 abstractFutureC2143, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6307;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2143, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2143) == obj);
        return false;
    }
}
