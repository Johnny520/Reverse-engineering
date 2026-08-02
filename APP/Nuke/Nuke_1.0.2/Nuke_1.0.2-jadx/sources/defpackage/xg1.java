package defpackage;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xg1 extends bg1 {
    public final TreeMap f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xg1(z70 z70Var) {
        super("method_ids", z70Var, 4);
        this.f = new TreeMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jm2
    public final Collection c() {
        return this.f.values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int l(n30 n30Var) {
        if (n30Var == null) {
            um2.f("ref == null");
            return 0;
        }
        f();
        wg1 wg1Var = (wg1) this.f.get(n30Var);
        if (wg1Var != null) {
            return wg1Var.e();
        }
        s.j("not found");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void m(n30 n30Var) {
        if (n30Var == null) {
            throw new NullPointerException("method == null");
        }
        g();
        if (((wg1) this.f.get(n30Var)) == null) {
            this.f.put(n30Var, new wg1(n30Var));
        }
    }
}
