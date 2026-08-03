package ng;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p136j8.C2104o;

/* JADX INFO: renamed from: ng.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3003a implements InterfaceC3012j {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f9786a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3003a(InterfaceC3012j interfaceC3012j) {
        this.f9786a = new AtomicReference(interfaceC3012j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ng.InterfaceC3012j
    public final Iterator iterator() {
        InterfaceC3012j interfaceC3012j = (InterfaceC3012j) this.f9786a.getAndSet(null);
        if (interfaceC3012j != null) {
            return interfaceC3012j.iterator();
        }
        C2104o.m5276A("This sequence can be consumed only once.");
        return null;
    }
}
