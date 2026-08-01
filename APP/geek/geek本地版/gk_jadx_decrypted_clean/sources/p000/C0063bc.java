package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: bc */
/* JADX INFO: loaded from: classes.dex */
public final class C0063bc implements i20 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f806a;

    public C0063bc(l20 l20Var) {
        this.f806a = new AtomicReference(l20Var);
    }

    @Override // p000.i20
    public final Iterator iterator() {
        i20 i20Var = (i20) this.f806a.getAndSet(null);
        if (i20Var != null) {
            return i20Var.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
