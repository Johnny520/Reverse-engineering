package p178i3;

import java.util.concurrent.atomic.AtomicReference;
import p074O2.InterfaceC1046d;
import p184j3.AbstractC2383b;
import p184j3.AbstractC2384c;
import p184j3.AbstractC2385d;

/* JADX INFO: renamed from: i3.D */
/* JADX INFO: loaded from: classes.dex */
public final class C2319D extends AbstractC2385d {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f7565a = new AtomicReference(null);

    @Override // p184j3.AbstractC2385d
    /* JADX INFO: renamed from: a */
    public final boolean mo4149a(AbstractC2383b abstractC2383b) {
        AtomicReference atomicReference = this.f7565a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC2339t.f7626b);
        return true;
    }

    @Override // p184j3.AbstractC2385d
    /* JADX INFO: renamed from: b */
    public final InterfaceC1046d[] mo4150b(AbstractC2383b abstractC2383b) {
        this.f7565a.set(null);
        return AbstractC2384c.f7729a;
    }
}
