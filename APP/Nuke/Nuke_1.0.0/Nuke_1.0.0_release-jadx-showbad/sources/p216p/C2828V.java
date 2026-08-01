package p216p;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p207n3.C2695c;

/* JADX INFO: renamed from: p.V */
/* JADX INFO: loaded from: classes.dex */
public final class C2828V {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f8905a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final C2695c f8906b = new C2695c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m5025a(C2828V c2828v, C2826T c2826t) {
        AtomicReference atomicReference = c2828v.f8905a;
        while (true) {
            C2826T c2826t2 = (C2826T) atomicReference.get();
            if (c2826t2 != null && c2826t.f8893a.compareTo(c2826t2.f8893a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(c2826t2, c2826t)) {
                if (atomicReference.get() != c2826t2) {
                    break;
                }
            }
            if (c2826t2 != null) {
                c2826t2.f8894b.mo3905c(new C2825S("Mutation interrupted", 2));
                return;
            }
            return;
        }
    }
}
