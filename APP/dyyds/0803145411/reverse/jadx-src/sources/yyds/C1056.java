package yyds;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: yyds.ᛵᛳᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1056 extends AbstractC0381 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f4825;

    public C1056(long j, C1056 c1056, int i) {
        super(j, c1056, i);
        this.f4825 = new AtomicReferenceArray(AbstractC0891.f4080);
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f1959 + ", hashCode=" + hashCode() + ']';
    }

    @Override // yyds.AbstractC0381
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final int mo1083() {
        return AbstractC0891.f4080;
    }

    @Override // yyds.AbstractC0381
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo1086(int i) {
        this.f4825.set(i, AbstractC0891.f4076);
        if (AbstractC0381.f1958.incrementAndGet(this) == AbstractC0891.f4080) {
            m2538();
        }
    }
}
