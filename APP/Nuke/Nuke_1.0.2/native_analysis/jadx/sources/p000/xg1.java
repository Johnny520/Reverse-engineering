package p000;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xg1 extends bg1 {

    /* JADX INFO: renamed from: f */
    public final TreeMap f13025f;

    public xg1(z70 z70Var) {
        super("method_ids", z70Var, 4);
        this.f13025f = new TreeMap();
    }

    @Override // p000.jm2
    /* JADX INFO: renamed from: c */
    public final Collection mo398c() {
        return this.f13025f.values();
    }

    /* JADX INFO: renamed from: l */
    public final int m6150l(n30 n30Var) {
        if (n30Var == null) {
            um2.m5516f("ref == null");
            return 0;
        }
        m2518f();
        wg1 wg1Var = (wg1) this.f13025f.get(n30Var);
        if (wg1Var != null) {
            return wg1Var.m2415e();
        }
        C0676s.m4651j("not found");
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m6151m(n30 n30Var) {
        if (n30Var == null) {
            throw new NullPointerException("method == null");
        }
        m2519g();
        if (((wg1) this.f13025f.get(n30Var)) == null) {
            this.f13025f.put(n30Var, new wg1(n30Var));
        }
    }
}
