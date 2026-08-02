package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ez implements uo2 {
    public final AtomicReference a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ez(uo2 uo2Var) {
        this.a = new AtomicReference(uo2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.uo2
    public final Iterator iterator() {
        uo2 uo2Var = (uo2) this.a.getAndSet(null);
        if (uo2Var != null) {
            return uo2Var.iterator();
        }
        s.l("This sequence can be consumed only once.");
        return null;
    }
}
