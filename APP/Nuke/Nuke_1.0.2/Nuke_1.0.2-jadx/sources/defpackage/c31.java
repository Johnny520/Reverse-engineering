package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c31 implements w41 {
    public static final c31 a = new c31();
    public static final b31 b = b31.b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        rg3.o(y40Var);
        return new z21((List) new cg(o31.a).j(y40Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        z21 z21Var = (z21) obj;
        z21Var.getClass();
        rg3.m(ve0Var);
        o31 o31Var = o31.a;
        yo2 yo2VarE = o31Var.e();
        yo2VarE.getClass();
        bg bgVar = new bg(yo2VarE, 0);
        int size = z21Var.size();
        wx wxVarB = ve0Var.b(bgVar);
        Iterator<j31> it = z21Var.iterator();
        for (int i = 0; i < size; i++) {
            ((dv2) wxVarB).w(bgVar, i, o31Var, it.next());
        }
        wxVarB.a(bgVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return b;
    }
}
