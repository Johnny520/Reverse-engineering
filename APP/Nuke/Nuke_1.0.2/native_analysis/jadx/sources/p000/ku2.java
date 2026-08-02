package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ku2 extends AbstractC0527o3 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f5820a = new AtomicReference(null);

    @Override // p000.AbstractC0527o3
    /* JADX INFO: renamed from: a */
    public final boolean mo2738a(AbstractC0484n3 abstractC0484n3) {
        AtomicReference atomicReference = this.f5820a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(pp0.f8440i);
        return true;
    }

    @Override // p000.AbstractC0527o3
    /* JADX INFO: renamed from: b */
    public final t00[] mo2739b(AbstractC0484n3 abstractC0484n3) {
        this.f5820a.set(null);
        return p40.f7965a;
    }
}
