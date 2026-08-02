package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n81 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ q81 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ n81(q81 q81Var, int i) {
        this.h = i;
        this.i = q81Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        q81 q81Var = this.i;
        switch (i) {
            case 0:
                t81 t81Var = (t81) q81Var.v.a();
                int iC = t81Var.c();
                int i2 = 0;
                while (true) {
                    if (i2 >= iC) {
                        i2 = -1;
                    } else if (!t81Var.d(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int iIntValue = ((Integer) obj).intValue();
                t81 t81Var2 = (t81) q81Var.v.a();
                if (iIntValue < 0 || iIntValue >= t81Var2.c()) {
                    StringBuilder sbN = vi0.n(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbN.append(t81Var2.c());
                    sbN.append(')');
                    nz0.a(sbN.toString());
                }
                p7.A(q81Var.A0(), null, new p81(q81Var, iIntValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
