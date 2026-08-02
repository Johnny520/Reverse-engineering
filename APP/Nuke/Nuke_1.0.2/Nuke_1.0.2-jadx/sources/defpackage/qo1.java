package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qo1 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;
    public final /* synthetic */ boolean j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ qo1(int i, String str, boolean z) {
        this.h = i;
        this.i = str;
        this.j = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        long jB;
        int i = this.h;
        a83 a83Var = a83.a;
        boolean z = this.j;
        switch (i) {
            case 0:
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(1 & iIntValue, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    if (z) {
                        go0Var.W(1571240306);
                        jB = ((lp1) go0Var.j(ur1.a)).f;
                        go0Var.p(false);
                    } else {
                        go0Var.W(1571316318);
                        jB = ju.b(0.45f, ((lp1) go0Var.j(ur1.a)).f);
                        go0Var.p(false);
                    }
                    eu.a(this.i, null, new m13(jB, rg3.D(14), im0.l, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, go0Var, 0, 1018);
                }
                break;
            default:
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.R();
                } else {
                    eu.a(this.i, null, new m13(ju.b(z ? 1.0f : 0.45f, ((lp1) go0Var2.j(ur1.a)).g), rg3.D(14), im0.m, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, go0Var2, 0, 1018);
                }
                break;
        }
        return a83Var;
    }
}
