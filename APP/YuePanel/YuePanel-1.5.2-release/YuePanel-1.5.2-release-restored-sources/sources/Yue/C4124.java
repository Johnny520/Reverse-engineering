package Yue;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Yue.ۥ۟ۧ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4124<T> implements InterfaceC7326<T> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final AtomicReference<InterfaceC7326<T>> f697;

    public C4124(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "sequence");
        this.f697 = new AtomicReference<>(interfaceC7326);
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<T> iterator() {
        InterfaceC7326<T> andSet = this.f697.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
