package p000a;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: a.L3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0204L3<T> implements InterfaceC0286Pd<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<InterfaceC0286Pd<T>> f692a;

    public C0204L3(InterfaceC0286Pd<? extends T> interfaceC0286Pd) {
        this.f692a = new AtomicReference<>(interfaceC0286Pd);
    }

    @Override // p000a.InterfaceC0286Pd
    public final Iterator<T> iterator() {
        InterfaceC0286Pd<T> andSet = this.f692a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
