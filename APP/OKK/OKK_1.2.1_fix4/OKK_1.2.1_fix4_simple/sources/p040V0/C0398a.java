package p040V0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: V0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0398a implements InterfaceC0405h {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f889a;

    public C0398a(InterfaceC0405h r2) {
        this.f889a = new AtomicReference(r2);
    }

    @Override // p040V0.InterfaceC0405h
    public final Iterator iterator() {
        InterfaceC0405h r02 = (InterfaceC0405h) this.f889a.getAndSet(null);
        if (r02 == null) goto L7;
        return r02.iterator();
    L7:
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
