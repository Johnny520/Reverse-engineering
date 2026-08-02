package p000;

import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vb1 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f11892a;

    public vb1(int i) {
        switch (i) {
            case 1:
                this.f11892a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f11892a = new LinkedHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5664a(tb1 tb1Var, in0 in0Var) {
        tb1Var.getClass();
        LinkedHashMap linkedHashMap = this.f11892a;
        if (linkedHashMap.containsKey(tb1Var)) {
            return;
        }
        linkedHashMap.put(tb1Var, new ub1(tb1Var, in0Var));
    }

    /* JADX INFO: renamed from: b */
    public void m5665b(AbstractC0812vj abstractC0812vj) {
        abstractC0812vj.getClass();
        Collection<ub1> collectionValues = this.f11892a.values();
        collectionValues.getClass();
        for (ub1 ub1Var : collectionValues) {
            ub1Var.getClass();
            tb1 tb1Var = ub1Var.f11207a;
            in0 in0Var = ub1Var.f11208b;
            tb1Var.getClass();
            synchronized (tb1Var.f10666d) {
                if (!tb1Var.f10666d.containsKey(abstractC0812vj)) {
                    tb1Var.f10666d.put(abstractC0812vj, in0Var);
                }
            }
        }
    }
}
