package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ib1 extends p40 {
    public final bt n;
    public final Object o;
    public final p40 p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ib1(bt btVar, Object obj, p40 p40Var) {
        obj.getClass();
        p40Var.getClass();
        this.n = btVar;
        this.o = obj;
        this.p = p40Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.p40
    public final p40 P(bt btVar, Object obj) {
        bt btVar2 = this.n;
        boolean zEquals = btVar.equals(btVar2);
        p40 p40Var = this.p;
        if (!zEquals) {
            p40 p40VarP = p40Var.P(btVar, null);
            if (p40VarP != p40Var) {
                this = new ib1(btVar2, this.o, p40VarP);
            }
            p40Var = this;
        }
        return obj != null ? new ib1(btVar, obj, p40Var) : p40Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        List listI0;
        List listT = wo2.T(new c70(new ta(23, this), new nx0(18)));
        if (listT.size() <= 1) {
            listI0 = du.F0(listT);
        } else {
            listI0 = du.I0(listT);
            Collections.reverse(listI0);
        }
        return du.u0(listI0, null, "{", "}", new nx0(19), 25);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.p40
    public final Object u(bt btVar) {
        return btVar.equals(this.n) ? p40.y(btVar).cast(this.o) : this.p.u(btVar);
    }
}
