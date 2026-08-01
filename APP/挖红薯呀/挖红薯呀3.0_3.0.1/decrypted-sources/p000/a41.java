package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class a41 extends AbstractC0494n0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f55a = new AtomicReference(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0494n0
    /* JADX INFO: renamed from: a */
    public final boolean mo20a(AbstractC0451m0 abstractC0451m0) {
        AtomicReference atomicReference = this.f55a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(pf1.f4844j);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0494n0
    /* JADX INFO: renamed from: b */
    public final InterfaceC0322ik[] mo21b(AbstractC0451m0 abstractC0451m0) {
        this.f55a.set(null);
        return AbstractC0307i4.f2420a;
    }
}
