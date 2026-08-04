package yyds;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: yyds.ᛳᛴᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0579 extends AbstractC0395 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f2773;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f2774;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f2775;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f2776;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final AtomicReferenceFieldUpdater f2777;

    public C0579(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f2773 = atomicReferenceFieldUpdater;
        this.f2774 = atomicReferenceFieldUpdater2;
        this.f2777 = atomicReferenceFieldUpdater3;
        this.f2775 = atomicReferenceFieldUpdater4;
        this.f2776 = atomicReferenceFieldUpdater5;
    }

    @Override // yyds.AbstractC0395
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final void mo1143(C1037 c1037, Thread thread) {
        this.f2773.lazySet(c1037, thread);
    }

    @Override // yyds.AbstractC0395
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final boolean mo1144(AbstractFutureC2622 abstractFutureC2622, C1037 c1037, C1037 c10372) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2777;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2622, c1037, c10372)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2622) == c1037);
        return false;
    }

    @Override // yyds.AbstractC0395
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final void mo1145(C1037 c1037, C1037 c10372) {
        this.f2774.lazySet(c1037, c10372);
    }

    @Override // yyds.AbstractC0395
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo1146(AbstractFutureC2622 abstractFutureC2622, C1336 c1336) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2775;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2622, c1336, C1336.f6186)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2622) == c1336);
        return false;
    }

    @Override // yyds.AbstractC0395
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final boolean mo1147(AbstractFutureC2622 abstractFutureC2622, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2776;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2622, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2622) == obj);
        return false;
    }
}
