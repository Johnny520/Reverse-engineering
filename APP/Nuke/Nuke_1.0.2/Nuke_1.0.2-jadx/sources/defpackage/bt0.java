package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bt0 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ zt0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ bt0(zt0 zt0Var) {
        this.h = 0;
        this.i = zt0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        zt0 zt0Var = this.i;
        px pxVar = (px) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    s11.l(zt0Var, go0Var, 0);
                }
                break;
            case 1:
                num.getClass();
                s11.m(zt0Var, pxVar, pp0.N(1));
                break;
            default:
                num.getClass();
                s11.l(zt0Var, pxVar, pp0.N(1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ bt0(zt0 zt0Var, int i, int i2) {
        this.h = i2;
        this.i = zt0Var;
    }
}
