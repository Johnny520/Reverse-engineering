package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gl1 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f3573a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final kl1 f3574b = new kl1();

    /* JADX INFO: renamed from: a */
    public static final void m1939a(gl1 gl1Var, dl1 dl1Var) {
        AtomicReference atomicReference = gl1Var.f3573a;
        while (true) {
            dl1 dl1Var2 = (dl1) atomicReference.get();
            if (dl1Var2 != null && dl1Var.f2105a.compareTo(dl1Var2.f2105a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(dl1Var2, dl1Var)) {
                if (atomicReference.get() != dl1Var2) {
                    break;
                }
            }
            if (dl1Var2 != null) {
                dl1Var2.f2106b.mo1704c(new qj0("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }
}
