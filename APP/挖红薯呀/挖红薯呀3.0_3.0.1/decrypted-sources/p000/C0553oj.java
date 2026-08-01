package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: oj */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0553oj implements p01 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f4580a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0553oj(p01 p01Var) {
        this.f4580a = new AtomicReference(p01Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.p01
    public final Iterator iterator() {
        p01 p01Var = (p01) this.f4580a.getAndSet(null);
        if (p01Var != null) {
            return p01Var.iterator();
        }
        C0921xc.m5134o("This sequence can be consumed only once.");
        return null;
    }
}
