package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tb1 extends vj {
    public final LinkedHashMap d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tb1() {
        super(true);
        this.d = new LinkedHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(Object obj) {
        List<ow1> listT0;
        Object x92Var;
        synchronized (this.d) {
            listT0 = we1.t0(this.d);
        }
        for (ow1 ow1Var : listT0) {
            vj vjVar = (vj) ow1Var.h;
            in0 in0Var = (in0) ow1Var.i;
            ArrayList arrayList = st0.a;
            vjVar.getClass();
            if (st0.a.contains(vjVar) && st0.b(vjVar)) {
                try {
                    in0Var.j(obj);
                    x92Var = a83.a;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                Throwable thA = y92.a(x92Var);
                if (thA != null) {
                    pp1 pp1Var = pp1.a;
                    pp1.h(vjVar, "after_callback", thA, vi0.j("Listener ", d(), " callback failed"));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(vj vjVar) {
        vjVar.getClass();
        synchronized (this.d) {
            this.d.remove(vjVar);
        }
    }
}
