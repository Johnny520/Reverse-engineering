package p038T0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p011F0.C0122j;

/* JADX INFO: renamed from: T0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0276a implements InterfaceC0283h {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f642a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0276a(C0122j c0122j) {
        this.f642a = new AtomicReference(c0122j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p038T0.InterfaceC0283h
    public final Iterator iterator() {
        InterfaceC0283h interfaceC0283h = (InterfaceC0283h) this.f642a.getAndSet(null);
        if (interfaceC0283h != null) {
            return interfaceC0283h.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
