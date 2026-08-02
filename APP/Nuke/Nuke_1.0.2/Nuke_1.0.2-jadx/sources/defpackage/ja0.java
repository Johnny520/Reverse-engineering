package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ja0 extends s2 {
    public final Iterator j;
    public final HashSet k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ja0(Iterator it, eq1 eq1Var) {
        it.getClass();
        this.j = it;
        this.k = new HashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.s2
    public final void a() {
        Object next;
        do {
            Iterator it = this.j;
            if (!it.hasNext()) {
                this.h = 2;
                return;
            }
            next = it.next();
        } while (!this.k.add(next));
        this.i = next;
        this.h = 1;
    }
}
