package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gl1 {
    public final AtomicReference a = new AtomicReference(null);
    public final kl1 b = new kl1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(gl1 gl1Var, dl1 dl1Var) {
        AtomicReference atomicReference = gl1Var.a;
        while (true) {
            dl1 dl1Var2 = (dl1) atomicReference.get();
            if (dl1Var2 != null && dl1Var.a.compareTo(dl1Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(dl1Var2, dl1Var)) {
                if (atomicReference.get() != dl1Var2) {
                    break;
                }
            }
            if (dl1Var2 != null) {
                dl1Var2.b.c(new qj0("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }
}
