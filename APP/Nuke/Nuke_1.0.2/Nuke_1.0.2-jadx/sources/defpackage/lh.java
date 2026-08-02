package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lh implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xk1 i;
    public final /* synthetic */ xk1 j;
    public final /* synthetic */ xk1 k;
    public final /* synthetic */ xk1 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ lh(xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, xk1 xk1Var4, int i) {
        this.h = i;
        this.i = xk1Var;
        this.j = xk1Var2;
        this.k = xk1Var3;
        this.l = xk1Var4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        xk1 xk1Var = this.l;
        xk1 xk1Var2 = this.k;
        xk1 xk1Var3 = this.j;
        xk1 xk1Var4 = this.i;
        Set set = (Set) obj;
        switch (i) {
            case 0:
                set.getClass();
                if (((Boolean) xk1Var4.getValue()).booleanValue()) {
                    xk1Var3.setValue(set);
                } else {
                    xk1Var2.setValue(set);
                }
                xk1Var.setValue(Boolean.FALSE);
                break;
            default:
                set.getClass();
                if (((Boolean) xk1Var4.getValue()).booleanValue()) {
                    xk1Var3.setValue(set);
                } else {
                    xk1Var2.setValue(set);
                }
                xk1Var.setValue(Boolean.FALSE);
                break;
        }
        return a83Var;
    }
}
