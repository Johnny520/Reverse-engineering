package p143c3;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: c3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1899a implements InterfaceC1905g {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f6465a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1899a(InterfaceC1905g interfaceC1905g) {
        this.f6465a = new AtomicReference(interfaceC1905g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p143c3.InterfaceC1905g
    public final Iterator iterator() {
        InterfaceC1905g interfaceC1905g = (InterfaceC1905g) this.f6465a.getAndSet(null);
        if (interfaceC1905g != null) {
            return interfaceC1905g.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
