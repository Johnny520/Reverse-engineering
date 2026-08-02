package defpackage;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ni0 extends bg1 {
    public final TreeMap f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ni0(z70 z70Var) {
        super("field_ids", z70Var, 4);
        this.f = new TreeMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jm2
    public final Collection c() {
        return this.f.values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int l(c30 c30Var) {
        if (c30Var == null) {
            um2.f("ref == null");
            return 0;
        }
        f();
        mi0 mi0Var = (mi0) this.f.get(c30Var);
        if (mi0Var != null) {
            return mi0Var.e();
        }
        s.j("not found");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void m(c30 c30Var) {
        if (c30Var == null) {
            throw new NullPointerException("field == null");
        }
        g();
        if (((mi0) this.f.get(c30Var)) == null) {
            this.f.put(c30Var, new mi0(c30Var));
        }
    }
}
