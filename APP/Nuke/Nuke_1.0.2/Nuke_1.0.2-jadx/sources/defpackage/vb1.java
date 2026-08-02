package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vb1 {
    public final LinkedHashMap a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vb1(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(tb1 tb1Var, in0 in0Var) {
        tb1Var.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(tb1Var)) {
            return;
        }
        linkedHashMap.put(tb1Var, new ub1(tb1Var, in0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(vj vjVar) {
        vjVar.getClass();
        Collection<ub1> collectionValues = this.a.values();
        collectionValues.getClass();
        for (ub1 ub1Var : collectionValues) {
            ub1Var.getClass();
            tb1 tb1Var = ub1Var.a;
            in0 in0Var = ub1Var.b;
            tb1Var.getClass();
            synchronized (tb1Var.d) {
                if (!tb1Var.d.containsKey(vjVar)) {
                    tb1Var.d.put(vjVar, in0Var);
                }
            }
        }
    }
}
