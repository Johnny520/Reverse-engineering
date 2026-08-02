package defpackage;

import java.util.Map;
import nuke.ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class at0 implements mn0 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ lp1 i;
    public final /* synthetic */ xk1 j;
    public final /* synthetic */ HomeActivity k;
    public final /* synthetic */ xk1 l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ Map n;
    public final /* synthetic */ xk1 o;
    public final /* synthetic */ xk1 p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ at0(lp1 lp1Var, xk1 xk1Var, HomeActivity homeActivity, xk1 xk1Var2, boolean z, Map map, xk1 xk1Var3, xk1 xk1Var4) {
        this.i = lp1Var;
        this.j = xk1Var;
        this.k = homeActivity;
        this.l = xk1Var2;
        this.m = z;
        this.n = map;
        this.o = xk1Var3;
        this.p = xk1Var4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                lp1 lp1Var = this.i;
                xk1 xk1Var = this.j;
                HomeActivity homeActivity = this.k;
                xk1 xk1Var2 = this.l;
                return HomeActivity.onCreate$lambda$0$17(this.m, lp1Var, xk1Var, homeActivity, xk1Var2, this.n, this.o, this.p, (px) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return HomeActivity.onCreate$lambda$0$17$0(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (px) obj, iIntValue2);
        }
    }

    public /* synthetic */ at0(boolean z, lp1 lp1Var, xk1 xk1Var, HomeActivity homeActivity, xk1 xk1Var2, Map map, xk1 xk1Var3, xk1 xk1Var4) {
        this.m = z;
        this.i = lp1Var;
        this.j = xk1Var;
        this.k = homeActivity;
        this.l = xk1Var2;
        this.n = map;
        this.o = xk1Var3;
        this.p = xk1Var4;
    }
}
