package p000;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ni0 extends bg1 {

    /* JADX INFO: renamed from: f */
    public final TreeMap f7164f;

    public ni0(z70 z70Var) {
        super("field_ids", z70Var, 4);
        this.f7164f = new TreeMap();
    }

    @Override // p000.jm2
    /* JADX INFO: renamed from: c */
    public final Collection mo398c() {
        return this.f7164f.values();
    }

    /* JADX INFO: renamed from: l */
    public final int m3309l(c30 c30Var) {
        if (c30Var == null) {
            um2.m5516f("ref == null");
            return 0;
        }
        m2518f();
        mi0 mi0Var = (mi0) this.f7164f.get(c30Var);
        if (mi0Var != null) {
            return mi0Var.m2415e();
        }
        C0676s.m4651j("not found");
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m3310m(c30 c30Var) {
        if (c30Var == null) {
            throw new NullPointerException("field == null");
        }
        m2519g();
        if (((mi0) this.f7164f.get(c30Var)) == null) {
            this.f7164f.put(c30Var, new mi0(c30Var));
        }
    }
}
