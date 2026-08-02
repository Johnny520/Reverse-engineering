package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b71 extends o61 {
    public final /* synthetic */ f71 b;
    public final /* synthetic */ mn0 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b71(f71 f71Var, mn0 mn0Var, String str) {
        super(str);
        this.b = f71Var;
        this.c = mn0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nf1
    public final of1 g(pf1 pf1Var, List list, long j) {
        f71 f71Var = this.b;
        z61 z61Var = f71Var.o;
        z61Var.h = pf1Var.getLayoutDirection();
        z61Var.i = pf1Var.b();
        z61Var.j = pf1Var.m();
        boolean zU = pf1Var.u();
        mn0 mn0Var = this.c;
        if (zU || f71Var.h.o == null) {
            f71Var.k = 0;
            of1 of1Var = (of1) mn0Var.g(z61Var, new fz(j));
            return new a71(of1Var, f71Var, f71Var.k, of1Var, 1);
        }
        f71Var.l = 0;
        of1 of1Var2 = (of1) mn0Var.g(f71Var.p, new fz(j));
        return new a71(of1Var2, f71Var, f71Var.l, of1Var2, 0);
    }
}
