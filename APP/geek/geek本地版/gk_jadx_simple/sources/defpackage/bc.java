package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class bc implements i20 {
    public final AtomicReference a;

    public bc(l20 r2) {
        this.a = new AtomicReference(r2);
    }

    @Override // defpackage.i20
    public final Iterator iterator() {
        i20 r0 = (i20) this.a.getAndSet(null);
        if (r0 == null) goto L7;
        return r0.iterator();
    L7:
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
