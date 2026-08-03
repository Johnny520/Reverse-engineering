package p040V0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: V0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0398a implements InterfaceC0405h {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f889a;

    public C0398a(InterfaceC0405h interfaceC0405h) {
        this.f889a = new AtomicReference(interfaceC0405h);
    }

    @Override // p040V0.InterfaceC0405h
    public final Iterator iterator() {
        InterfaceC0405h interfaceC0405h = (InterfaceC0405h) this.f889a.getAndSet(null);
        if (interfaceC0405h != null) {
            return interfaceC0405h.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
