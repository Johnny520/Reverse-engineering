package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: bb */
/* JADX INFO: loaded from: classes.dex */
public final class C1216bb implements InterfaceC2777yx {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f4151a;

    public C1216bb(InterfaceC2777yx interfaceC2777yx) {
        this.f4151a = new AtomicReference(interfaceC2777yx);
    }

    @Override // p000.InterfaceC2777yx
    public final Iterator iterator() {
        InterfaceC2777yx interfaceC2777yx = (InterfaceC2777yx) this.f4151a.getAndSet(null);
        if (interfaceC2777yx != null) {
            return interfaceC2777yx.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
