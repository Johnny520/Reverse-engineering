package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: kc */
/* JADX INFO: loaded from: classes.dex */
public final class C0406kc implements p20 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f2813a;

    public C0406kc(s20 s20Var) {
        this.f2813a = new AtomicReference(s20Var);
    }

    @Override // p000.p20
    public final Iterator iterator() {
        p20 p20Var = (p20) this.f2813a.getAndSet(null);
        if (p20Var != null) {
            return p20Var.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
