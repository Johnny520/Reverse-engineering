package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: bb */
/* JADX INFO: loaded from: classes.dex */
public final class C1216bb implements InterfaceC2777yx {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f4151a;

    public C1216bb(InterfaceC2777yx r2) {
        this.f4151a = new AtomicReference(r2);
    }

    @Override // p000.InterfaceC2777yx
    public final Iterator iterator() {
        InterfaceC2777yx r0 = (InterfaceC2777yx) this.f4151a.getAndSet(null);
        if (r0 == null) goto L7;
        return r0.iterator();
    L7:
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
